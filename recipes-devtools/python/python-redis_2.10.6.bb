
SUMMARY = "Python client for Redis key-value store"
DESCRIPTION = "The Python interface to the Redis key-value store."
HOMEPAGE = "http://github.com/andymccurdy/redis-py"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=51d9ad56299ab60ba7be65a621004f27"

SRC_URI[md5sum] = "048348d8cfe0b5d0bba2f4d835005c3b"
SRC_URI[sha256sum] = "a22ca993cea2962dbb588f9f30d0015ac4afcc45bee27d3978c0dbe9e97c6c0f"

inherit pypi setuptools

RDEPENDS:${PN} += "\
    ${PYTHON_PN}-datetime \
"

SKIP_RECIPE[python-redis] ?= "${@bb.utils.contains('I_SWEAR_TO_MIGRATE_TO_PYTHON3', 'yes', '', 'python2 is out of support for long time, read https://www.python.org/doc/sunset-python-2/ https://python3statement.org/ and if you really have to temporarily use this, then set I_SWEAR_TO_MIGRATE_TO_PYTHON3 to "yes"', d)}"
