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

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/File-LibMagic-1.16.tar.gz"

SRC_URI[md5sum] = "de0cc720d1599428be01a7fa50a5cc5b"
SRC_URI[sha256sum] = "c8a695fac1454f52e18e2e1b624c0647cf117326014023dda69fa3e1a5f33d60"
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
