SUMMARY = "A featureful, correct URL for Python"
DESCRIPTION = "A featureful, correct URL for Python"
HOMEPAGE = "https://github.com/python-hyper/hyperlink"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3893d4ed05dcc823f8ed685a9ea19bcb"

SRC_URI[sha256sum] = "4288e34705da077fada1111a24a0aa08bb1e76699c9ce49876af722441845654"
SRC_URI[md5sum] = "4772fb4d87c26a1ab22a6161424e3cba"

inherit pypi setuptools

RDEPENDS:${PN} += "\
    ${PYTHON_PN}-idna \
    ${PYTHON_PN}-netclient \
    ${PYTHON_PN}-stringold \
"

PACKAGES =. "${PN}-test "

FILES:${PN}-test += " \
        ${PYTHON_SITEPACKAGES_DIR}/hyperlinkt/test \
"

SKIP_RECIPE[python-hyperlink] ?= "${@bb.utils.contains('I_SWEAR_TO_MIGRATE_TO_PYTHON3', 'yes', '', 'python2 is out of support for long time, read https://www.python.org/doc/sunset-python-2/ https://python3statement.org/ and if you really have to temporarily use this, then set I_SWEAR_TO_MIGRATE_TO_PYTHON3 to "yes"', d)}"
