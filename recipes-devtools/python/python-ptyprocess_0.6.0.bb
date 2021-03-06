SUMMARY = "Run a subprocess in a pseudo terminal"
HOMEPAGE = "http://ptyprocess.readthedocs.io/en/latest/"
SECTION = "devel/python"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cfdcd51fa7d5808da4e74346ee394490"

SRCNAME = "ptyprocess"

SRC_URI[md5sum] = "37402d69f3b50913d4d483587bffad8f"
SRC_URI[sha256sum] = "923f299cc5ad920c68f2bc0bc98b75b9f838b93b599941a6b63ddbc2476394c0"

UPSTREAM_CHECK_URI = "https://pypi.python.org/pypi/ptyprocess"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit pypi setuptools

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-core \
"

BBCLASSEXTEND = "native nativesdk"

SKIP_RECIPE[python-ptyprocess] ?= "${@bb.utils.contains('I_SWEAR_TO_MIGRATE_TO_PYTHON3', 'yes', '', 'python2 is out of support for long time, read https://www.python.org/doc/sunset-python-2/ https://python3statement.org/ and if you really have to temporarily use this, then set I_SWEAR_TO_MIGRATE_TO_PYTHON3 to "yes"', d)}"
