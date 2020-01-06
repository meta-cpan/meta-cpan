DESCRIPTION = "Perl interface to log via Log4cplus"

SECTION = "libs"
LICENSE = "Apachev2"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Lib-Log4cplus"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/Lib-Log4cplus-0.001.tar.gz"

SRC_URI[md5sum] = "c916a832983f5d6845f1d9647b459def"
SRC_URI[sha256sum] = "c04c23ab4f8a6603611ea1c567ca9ab4eb93f310c6c1b8e435c174e54089e236"
DEPENDS += "capture-tiny-perl-native"
DEPENDS += "config-autoconf-perl-native"
DEPENDS += "log4cplus"
RECOMMENDS += "test-leaktrace-perl-native"

S = "${WORKDIR}/Lib-Log4cplus-${PV}"

inherit cpan pkgconfig

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

BBCLASSEXTEND = "native"
