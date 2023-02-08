DESCRIPTION = "SQLite is a public domain file-based relational database engine that you \
can find at <https://www.sqlite.org/>."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DBD-SQLite"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IS/ISHIGAKI/DBD-SQLite-1.70.tar.gz"

SRC_URI[md5sum] = "cc20dad09474da382488686ea07e8288"
SRC_URI[sha256sum] = "40fd8ddf539e0e773a7a4e6d376794c3301459f9ab0050978bdcf97113dafe3e"

DEPENDS += "dbi-perl-native"
DEPENDS += "sqlite3"

RDEPENDS:${PN} += "dbi-perl sqlite3"
RDEPENDS:${PN} += "perl-module-constant perl-module-locale perl-module-tie-hash"

S = "${WORKDIR}/DBD-SQLite-${PV}"

inherit cpan

EXTRA_CPANFLAGS="SQLITE_LOCATION=${STAGING_EXECPREFIXDIR}"

BBCLASSEXTEND = "native"
