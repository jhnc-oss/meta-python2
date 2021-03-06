
SUMMARY = "A Python Interface To The cURL library"
DESCRIPTION = "\
PycURL is a Python interface to libcurl, the multiprotocol file \
transfer library. Similarly to the urllib Python module, PycURL can \
be used to fetch objects identified by a URL from a Python program \
"
SECTION = "devel/python"
HOMEPAGE = "http://pycurl.io/"

LICENSE = "LGPL-2.0-only | MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING-LGPL;md5=4fbd65380cdd255951079008b364516c \
    file://COPYING-MIT;md5=2df767ed35d8ea83de4a93feb55e7815 \
"

SRC_URI[md5sum] = "f0ed4c805e8bec734990e2e0ee78568e"
SRC_URI[sha256sum] = "6f08330c5cf79fa8ef68b9912b9901db7ffd34b63e225dce74db56bb21deda8e"

inherit pypi setuptools

PYPI_PACKAGE = "pycurl"

DEPENDS = "\
    curl \
    ${PYTHON_PN}\
"

SKIP_RECIPE[python-pycurl] ?= "${@bb.utils.contains('I_SWEAR_TO_MIGRATE_TO_PYTHON3', 'yes', '', 'python2 is out of support for long time, read https://www.python.org/doc/sunset-python-2/ https://python3statement.org/ and if you really have to temporarily use this, then set I_SWEAR_TO_MIGRATE_TO_PYTHON3 to "yes"', d)}"
