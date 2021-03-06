DESCRIPTION = "JavaScript minifier."
HOMEPAGE = "https://github.com/tikitu/jsmin/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3a3301ce2ad647e172f4a1016c67324d"

inherit setuptools pypi
SRC_URI[md5sum] = "00e7a3179a4591aab2ee707b3214e2fd"
SRC_URI[sha256sum] = "b6df99b2cd1c75d9d342e4335b535789b8da9107ec748212706ef7bbe5c2553b"

BBCLASSEXTEND = "native nativesdk"

SKIP_RECIPE[python-jsmin] ?= "${@bb.utils.contains('I_SWEAR_TO_MIGRATE_TO_PYTHON3', 'yes', '', 'python2 is out of support for long time, read https://www.python.org/doc/sunset-python-2/ https://python3statement.org/ and if you really have to temporarily use this, then set I_SWEAR_TO_MIGRATE_TO_PYTHON3 to "yes"', d)}"
