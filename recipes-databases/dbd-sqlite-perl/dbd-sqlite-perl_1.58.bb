DESCRIPTION = "SQLite is a public domain file-based relational database engine that you \
can find at <http://www.sqlite.org/>."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DBD-SQLite"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IS/ISHIGAKI/DBD-SQLite-1.58.tar.gz \
    file://use-system-sqlite3.patch;striplevel=0 \
"

SRC_URI[md5sum] = "8144c16e165e9a925839e9a8c507e0df"
SRC_URI[sha256sum] = "7120dd99d0338dea2802fda8bfe3fbf10077d5af559f6c67ae35e9270d1a1d3b"

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
