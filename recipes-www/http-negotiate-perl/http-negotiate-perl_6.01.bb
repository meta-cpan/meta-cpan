DESCRIPTION = "This module provides a complete implementation of the HTTP content \
negotiation algorithm specified in draft-ietf-http-v11-spec-00.ps \
chapter \
12. Content negotiation allows for the selection of a preferred content \
representation based upon attributes of the negotiable variants and the \
value of the various Accept* header fields in the request."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Negotiate"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/HTTP-Negotiate-6.01.tar.gz"

SRC_URI[md5sum] = "1236195250e264d7436e7bb02031671b"
SRC_URI[sha256sum] = "1c729c1ea63100e878405cda7d66f9adfd3ed4f1d6cacaca0ee9152df728e016"
RDEPENDS_${PN} += "http-message-perl"

S = "${WORKDIR}/HTTP-Negotiate-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
