DESCRIPTION = "*HTTP::Status* is a library of routines for defining and classifying \
HTTP status codes for libwww-perl. Status codes are used to encode the \
overall \
outcome of an HTTP response message. Codes correspond to those defined \
in \
RFC 2616 and RFC 2518."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Message"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/HTTP-Message-6.06.tar.gz"

SRC_URI[md5sum] = "e563ac516e28d33f65bc0f295f625f85"
SRC_URI[sha256sum] = "087e97009c5239dca4631cf433d836771b3fc5ba5685eef1965f9d3415cbad63"
RDEPENDS_${PN} += "encode-locale-perl"
RDEPENDS_${PN} += "http-date-perl"
RDEPENDS_${PN} += "io-html-perl"
RDEPENDS_${PN} += "uri-perl"
RDEPENDS_${PN} += "lwp-mediatypes-perl"

S = "${WORKDIR}/HTTP-Message-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
