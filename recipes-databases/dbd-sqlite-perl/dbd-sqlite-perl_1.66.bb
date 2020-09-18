DESCRIPTION = "SQLite is a public domain file-based relational database engine that you \
can find at <https://www.sqlite.org/>."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DBD-SQLite"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IS/ISHIGAKI/DBD-SQLite-1.66.tar.gz \
	file://use-system-sqlite3.patch;striplevel=0 \
"

SRC_URI[md5sum] = "38581209de5c981f0e79840c8937fa16"
SRC_URI[sha256sum] = "89e75dff9f66c273e0e459d51f151f88960eb7d82e2821e6902f18688ba592fe"

DEPENDS += "dbi-perl-native"
DEPENDS += "sqlite3"

RDEPENDS_${PN} += "dbi-perl sqlite3"
RDEPENDS_${PN} += "perl-module-constant perl-module-locale perl-module-tie-hash"

S = "${WORKDIR}/DBD-SQLite-${PV}"

inherit cpan

EXTRA_CPANFLAGS="SQLITE_LOCATION=${STAGING_EXECPREFIXDIR}"

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
