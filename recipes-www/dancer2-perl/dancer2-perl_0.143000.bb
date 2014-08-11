DESCRIPTION = "Dancer2 is the new generation of Dancer, the lightweight web-framework \
for Perl. Dancer2 is a complete rewrite based on Moo."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Dancer2"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/X/XS/XSAWYERX/Dancer2-0.143000.tar.gz"

SRC_URI[md5sum] = "3dfa9eae39beb26728daad54e54e3c25"
SRC_URI[sha256sum] = "28e85851bbdc41f0db9f6d924519811897dd19115c9c8277a384a2ce2372c8f4"
RDEPENDS_${PV} += "app-cmd-perl"
RDEPENDS_${PV} += "class-load-perl"
RDEPENDS_${PV} += "file-sharedir-perl"
RDEPENDS_${PV} += "hash-merge-simple-perl"
RDEPENDS_${PV} += "http-body-perl"
RDEPENDS_${PV} += "http-date-perl"
RDEPENDS_${PV} += "http-message-perl"
RDEPENDS_${PV} += "json-perl"
RDEPENDS_${PV} += "libconfig-any-perl"
RDEPENDS_${PV} += "liburi-perl"
RDEPENDS_${PV} += "libwww-perl-perl"
RDEPENDS_${PV} += "mime-types-perl"
RDEPENDS_${PV} += "module-runtime-perl"
RDEPENDS_${PV} += "moo-perl"
RDEPENDS_${PV} += "moox-types-mooselike-perl"
RDEPENDS_${PV} += "plack-perl"
RDEPENDS_${PV} += "return-multilevel-perl"
RDEPENDS_${PV} += "role-tiny-perl"
RDEPENDS_${PV} += "template-tiny-perl"
RDEPENDS_${PV} += "template-toolkit-perl"
RRECOMMENDS_${PV} += "cgi-deurl-xs-perl"
RRECOMMENDS_${PV} += "crypt-urandom-perl"
RRECOMMENDS_${PV} += "math-random-isaac-xs-perl"
RRECOMMENDS_${PV} += "scope-upper-perl"
RRECOMMENDS_${PV} += "url-encode-xs-perl"
DEPENDS += "capture-tiny-perl"
DEPENDS += "file-sharedir-install-perl"
DEPENDS += "perl"
DEPENDS += "test-fatal-perl"
DEPENDS += "test-mocktime-perl"
DEPENDS += "test-script-perl"
DEPENDS += "test-tcp-perl"

S = "${WORKDIR}/Dancer2-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
