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

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/File-LibMagic-1.12.tar.gz"

SRC_URI[md5sum] = "817bcbc86708f3f7618b69771d75a855"
SRC_URI[sha256sum] = "e206e0b82a56afb74bcf4db705c8ec68ad2c5ff13dd73d2ce041752741428bab"
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
