DESCRIPTION = "The libwww-perl collection is a set of Perl modules which provides a \
simple and consistent application programming interface (API) to the \
World-Wide Web. The main focus of the library is to provide classes and \
functions that allow you to write WWW clients. The library also contain \
modules that are of more general use and even classes that help you \
implement simple HTTP servers."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/libwww-perl"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/libwww-perl-6.13.tar.gz"

SRC_URI[md5sum] = "85b36bcd2fd2450718ee14f894f0d3d1"
SRC_URI[sha256sum] = "5fbd13eebd1933e5a203fceb2c1629efbccff3efc8fab6ec0285c79d0a95f8b2"
RDEPENDS_${PN} += "encode-locale-perl"
RDEPENDS_${PN} += "file-listing-perl"
RDEPENDS_${PN} += "html-parser-perl"
RDEPENDS_${PN} += "http-cookies-perl"
RDEPENDS_${PN} += "http-daemon-perl"
RDEPENDS_${PN} += "http-date-perl"
RDEPENDS_${PN} += "http-message-perl"
RDEPENDS_${PN} += "http-negotiate-perl"
RDEPENDS_${PN} += "lwp-mediatypes-perl"
RDEPENDS_${PN} += "net-http-perl"
RDEPENDS_${PN} += "www-robotrules-perl"
RRECOMMENDS_${PN} += "lwp-protocol-https-perl"

S = "${WORKDIR}/libwww-perl-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
