DESCRIPTION = "The \"LWP::UserAgent\" is a class implementing a web user agent. \
\"LWP::UserAgent\" objects can be used to dispatch web requests."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/libwww-perl"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MS/MSCHILLI/libwww-perl-6.08.tar.gz"

SRC_URI[md5sum] = "28e5005609af16c1fa297d12e0312f86"
SRC_URI[sha256sum] = "314d239bdcee4bce849d5c9fe5986a39b2ce12199833ffa32d73a0950531fe94"
RDEPENDS_${PV} += "encode-locale-perl"
RDEPENDS_${PV} += "file-listing-perl"
RDEPENDS_${PV} += "html-parser-perl"
RDEPENDS_${PV} += "http-cookies-perl"
RDEPENDS_${PV} += "http-daemon-perl"
RDEPENDS_${PV} += "http-date-perl"
RDEPENDS_${PV} += "http-message-perl"
RDEPENDS_${PV} += "http-negotiate-perl"
RDEPENDS_${PV} += "liburi-perl"
RDEPENDS_${PV} += "lwp-mediatypes-perl"
RDEPENDS_${PV} += "net-http-perl"
RDEPENDS_${PV} += "www-robotrules-perl"
RRECOMMENDS_${PV} += "lwp-protocol-https-perl"
RRECOMMENDS_${PV} += "ntlm-perl"

S = "${WORKDIR}/libwww-perl-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
