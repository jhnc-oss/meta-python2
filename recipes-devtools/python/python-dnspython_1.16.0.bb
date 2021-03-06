SUMMARY = "DNS toolkit for Python"
DESCRIPTION = "dnspython is a DNS toolkit for Python. It supports almost all record types. \
It can be used for queries, zone transfers, and dynamic updates. It supports \
TSIG authenticated messages and EDNS0.\
\
dnspython provides both high and low level access to DNS. The high level \
classes perform queries for data of a given name, type, and class, and return \
an answer set. The low level classes allow direct manipulation of DNS zones, \
messages, names, and records."
HOMEPAGE = "http://www.dnspython.org/"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5af50906b5929837f667dfe31052bd34"

SRC_URI[md5sum] = "bc9ca3b3a82164667d5730ec6d5248a2"
SRC_URI[sha256sum] = "36c5e8e38d4369a08b6780b7f27d790a292b2b08eea01607865bf0936c558e01"

PYPI_PACKAGE_EXT = "zip"

inherit pypi setuptools

RDEPENDS:${PN} += " \
    ${PYTHON_PN}-crypt \
    ${PYTHON_PN}-io \
    ${PYTHON_PN}-math \
    ${PYTHON_PN}-netclient \
    ${PYTHON_PN}-numbers \
    ${PYTHON_PN}-threading \
"

SKIP_RECIPE[python-dnspython] ?= "${@bb.utils.contains('I_SWEAR_TO_MIGRATE_TO_PYTHON3', 'yes', '', 'python2 is out of support for long time, read https://www.python.org/doc/sunset-python-2/ https://python3statement.org/ and if you really have to temporarily use this, then set I_SWEAR_TO_MIGRATE_TO_PYTHON3 to "yes"', d)}"
