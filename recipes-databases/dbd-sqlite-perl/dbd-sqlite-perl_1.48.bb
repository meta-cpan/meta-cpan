DESCRIPTION = "SQLite is a public domain file-based relational database engine that \
you can find at <http://www.sqlite.org/>."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DBD-SQLite"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IS/ISHIGAKI/DBD-SQLite-1.48.tar.gz"

SRC_URI[md5sum] = "020c02ca595b2074a767a19af8506d2a"
SRC_URI[sha256sum] = "b397230f5d4cdc9923f91c62da9e535234f3055c528ede75afd7d24698030ea6"
DEPENDS += "dbi-perl-native"
RDEPENDS_${PN} += "dbi-perl sqlite3"
RDEPENDS_${PN} += "perl-module-constant perl-module-locale perl-module-tie-hash"

S = "${WORKDIR}/DBD-SQLite-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
