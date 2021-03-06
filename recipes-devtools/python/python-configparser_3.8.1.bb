SUMMARY = "Updated configparser from Python 3.7 for Python 2.6+."
DESCRIPTION = "This module provides the ConfigParser class which implements a basic \
configuration language which provides a structure similar to what's found in \
Microsoft Windows INI files."
SECTION = "devel/python"
HOMEPAGE = "https://docs.python.org/3/library/configparser.html"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=10;endline=10;md5=23f9ad5cad3d8cc0336e2a5d8a87e1fa"

SRC_URI[md5sum] = "bc1558ed941cb1acb80ff650726d5af8"
SRC_URI[sha256sum] = "bc37850f0cc42a1725a796ef7d92690651bf1af37d744cc63161dac62cabee17"

inherit pypi setuptools python-backports-init

RDEPENDS:${PN} += "python-pkgutil"

BBCLASSEXTEND = "native nativesdk"

SKIP_RECIPE[python-configparser] ?= "${@bb.utils.contains('I_SWEAR_TO_MIGRATE_TO_PYTHON3', 'yes', '', 'python2 is out of support for long time, read https://www.python.org/doc/sunset-python-2/ https://python3statement.org/ and if you really have to temporarily use this, then set I_SWEAR_TO_MIGRATE_TO_PYTHON3 to "yes"', d)}"
