DESCRIPTION = "SQLite is a public domain file-based relational database engine that you \
can find at <http://www.sqlite.org/>."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DBD-SQLite"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IS/ISHIGAKI/DBD-SQLite-1.50.tar.gz"

SRC_URI[md5sum] = "d56eebfb5f2a14be9413b025e7dca9fe"
SRC_URI[sha256sum] = "3ac513ab73944fd7d4b672e1fe885dc522b6369d38f46a68e67e0045bf159ce1"
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
