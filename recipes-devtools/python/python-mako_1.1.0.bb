SUMMARY = "A super-fast templating language that borrows the best ideas from the existing templating languages"
HOMEPAGE = "http://www.makotemplates.org/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=df7e6c7c82990acf0228a55e00d29bc9"

SRC_URI[md5sum] = "6c3f2da0b74af529a4c4a537d0848bf2"
SRC_URI[sha256sum] = "a36919599a9b7dc5d86a7a8988f23a9a3a3d083070023bab23d64f7f1d1e0a4b"

PYPI_PACKAGE = "Mako"

inherit pypi setuptools

RDEPENDS:${PN} = " \
    ${PYTHON_PN}-html \
    ${PYTHON_PN}-misc \
    ${PYTHON_PN}-netclient \
    ${PYTHON_PN}-shell \
    ${PYTHON_PN}-threading \
"

BBCLASSEXTEND = "native nativesdk"

SKIP_RECIPE[python-mako] ?= "${@bb.utils.contains('I_SWEAR_TO_MIGRATE_TO_PYTHON3', 'yes', '', 'python2 is out of support for long time, read https://www.python.org/doc/sunset-python-2/ https://python3statement.org/ and if you really have to temporarily use this, then set I_SWEAR_TO_MIGRATE_TO_PYTHON3 to "yes"', d)}"
