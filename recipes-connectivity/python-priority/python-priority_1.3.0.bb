DESCRIPTION = "A pure-Python implementation of the HTTP/2 priority tree"
HOMEPAGE = "https://github.com/python-hyper/priority"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=ae57d8a09fc8b6b164d7357339619045"

SRC_URI[md5sum] = "4f1ff52f7fa448e9d9cb46337ae86d1e"
SRC_URI[sha256sum] = "6bc1961a6d7fcacbfc337769f1a382c8e746566aaa365e78047abe9f66b2ffbe"

inherit pypi setuptools

SKIP_RECIPE[python-priority] ?= "${@bb.utils.contains('I_SWEAR_TO_MIGRATE_TO_PYTHON3', 'yes', '', 'python2 is out of support for long time, read https://www.python.org/doc/sunset-python-2/ https://python3statement.org/ and if you really have to temporarily use this, then set I_SWEAR_TO_MIGRATE_TO_PYTHON3 to "yes"', d)}"
