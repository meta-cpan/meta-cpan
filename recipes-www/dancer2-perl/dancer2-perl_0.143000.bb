DESCRIPTION = "Dancer2 is the new generation of Dancer, the lightweight web-framework \
for Perl. Dancer2 is a complete rewrite based on Moo."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Dancer2"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS += "app-cmd-perl"
DEPENDS += "class-load-perl"
DEPENDS += "file-sharedir-perl"
DEPENDS += "hash-merge-simple-perl"
DEPENDS += "http-body-perl"
DEPENDS += "http-date-perl"
DEPENDS += "http-message-perl"
DEPENDS += "json-perl"
DEPENDS += "libconfig-any-perl"
DEPENDS += "liburi-perl"
DEPENDS += "libwww-perl-perl"
DEPENDS += "mime-types-perl"
DEPENDS += "module-runtime-perl"
DEPENDS += "moo-perl"
DEPENDS += "moox-types-mooselike-perl"
DEPENDS += "plack-perl"
DEPENDS += "return-multilevel-perl"
DEPENDS += "role-tiny-perl"
DEPENDS += "template-tiny-perl"
DEPENDS += "template-toolkit-perl"
DEPENDS += "yaml-perl"

SRC_URI = "http://cpan.metacpan.org/authors/id/X/XS/XSAWYERX/Dancer2-0.143000.tar.gz"

SRC_URI[md5sum] = "3dfa9eae39beb26728daad54e54e3c25"
SRC_URI[sha256sum] = "28e85851bbdc41f0db9f6d924519811897dd19115c9c8277a384a2ce2372c8f4"

RRECOMMENDS_${PV} += "cgi-deurl-xs-perl"
RRECOMMENDS_${PV} += "crypt-urandom-perl"
RRECOMMENDS_${PV} += "math-random-isaac-xs-perl"
RRECOMMENDS_${PV} += "scope-upper-perl"
RRECOMMENDS_${PV} += "url-encode-xs-perl"

S = "${WORKDIR}/Dancer2-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
