SUMMARY = "A small Python module for determining appropriate + platform-specific dirs"
DESCRIPTION = "A small Python module for determining appropriate + \
platform-specific dirs, e.g. a 'user data dir'."
HOMEPAGE = "http://github.com/ActiveState/appdirs"
SECTION = "devel/python"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=31625363c45eb0c67c630a2f73e438e4"

SRC_URI[md5sum] = "44c679904082a2133f5566c8a0d3ab42"
SRC_URI[sha256sum] = "9e5896d1372858f8dd3344faf4e5014d21849c756c8d5701f78f8a103b372d92"

inherit pypi setuptools

SKIP_RECIPE[python-appdirs] ?= "${@bb.utils.contains('I_SWEAR_TO_MIGRATE_TO_PYTHON3', 'yes', '', 'python2 is out of support for long time, read https://www.python.org/doc/sunset-python-2/ https://python3statement.org/ and if you really have to temporarily use this, then set I_SWEAR_TO_MIGRATE_TO_PYTHON3 to "yes"', d)}"
