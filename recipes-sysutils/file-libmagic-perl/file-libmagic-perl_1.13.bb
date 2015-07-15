DESCRIPTION = "The \"File::LibMagic\" is a simple perl interface to libmagic \
from the file package (version 4.x or 5.x). You will need both the library \
(libmagic.so) and the header file (magic.h) to build this Perl module."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-LibMagic"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/File-LibMagic-1.13.tar.gz"

SRC_URI[md5sum] = "bbc0d525950aab95be42efd418b7c334"
SRC_URI[sha256sum] = "61f92c3137a3b86d63e61313b51aa2673991110d655eee792ea11c68bf2c0092"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "config-autoconf-perl-native"
DEPENDS += "perl file"

S = "${WORKDIR}/File-LibMagic-${PV}"

inherit cpan

do_configure() {
        export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	export LD="${CCLD}"
        cpan_do_configure
}

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	export LD="${CCLD}"
	cpan_do_compile
}

do_install() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	export LD="${CCLD}"
	cpan_do_install
}

BBCLASSEXTEND = "native"
