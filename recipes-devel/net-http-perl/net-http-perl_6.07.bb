DESCRIPTION = "The \"Net::HTTP\" class is a low-level HTTP client. An instance of the \
\"Net::HTTP\" class represents a connection to an HTTP server. The HTTP \
protocol is described in RFC 2616. The \"Net::HTTP\" class supports \
\"HTTP/1.0\" \
and \"HTTP/1.1\"."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-HTTP"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MS/MSCHILLI/Net-HTTP-6.07.tar.gz"

SRC_URI[md5sum] = "b6da691523456089d7a812ac398bc77e"
SRC_URI[sha256sum] = "9f31e0325a5a0930ad309fa019da9d208e57e236fb0598675ed883c820240364"
RDEPENDS_${PN} += "liburi-perl"
RRECOMMENDS_${PN} += "io-socket-ssl-perl"

S = "${WORKDIR}/Net-HTTP-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
