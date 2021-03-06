# Copyright (c) 2014 LG Electronics, Inc.

SUMMARY = "With this program/Python library you can easily create mock objects on D-Bus"
AUTHOR = "Martin Pitt <martin.pitt@ubuntu.com>"

LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI[md5sum] = "80f8caa838fad96483a8751e11d384f9"
SRC_URI[sha256sum] = "2d2ea892fa4633c3ec6ac1e912120ec493047a5c6522849b7d1c95ad755bce75"

SRC_URI += " \
    file://0001-Add-functionality-to-add-own-objects-to-internal-obj.patch \
    file://0002-Add-possibility-to-import-templates-from-packages.patch \
"

PYPI_PACKAGE = "python-dbusmock"

inherit pypi setuptools

RDEPENDS:${PN} += "\
    ${PYTHON_PN}-dbus \
    ${PYTHON_PN}-pygobject \
    ${PYTHON_PN}-xml \
    "

SKIP_RECIPE[python-dbusmock] ?= "${@bb.utils.contains('I_SWEAR_TO_MIGRATE_TO_PYTHON3', 'yes', '', 'python2 is out of support for long time, read https://www.python.org/doc/sunset-python-2/ https://python3statement.org/ and if you really have to temporarily use this, then set I_SWEAR_TO_MIGRATE_TO_PYTHON3 to "yes"', d)}"
