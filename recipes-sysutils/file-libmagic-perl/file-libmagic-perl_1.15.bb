DESCRIPTION = "The "File::LibMagic" is a simple perl interface to libmagic from the file \
package (version 4.x or 5.x). You will need both the library (libmagic.so) \
and the header file (magic.h) to build this Perl module."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-LibMagic"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/File-LibMagic-1.15.tar.gz"

SRC_URI[md5sum] = "e5753a9f1e992da5f79fdbe253b02cf9"
SRC_URI[sha256sum] = "2c7fb54912caf2c22d06b02d6a88edad970e0f8b017634dc30eec46e53763e84"
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
