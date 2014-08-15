DESCRIPTION = "The LWP::Protocol::https module provides support for using https \
schemed URLs with LWP. This module is a plug-in to the LWP protocol \
handling, so you \
don't use it directly. Once the module is installed LWP is able to \
access \
sites using HTTP over SSL/TLS."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/LWP-Protocol-https"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MS/MSCHILLI/LWP-Protocol-https-6.06.tar.gz"

SRC_URI[md5sum] = "06f5dfd33b07f6594a429dbbd5e6a2d1"
SRC_URI[sha256sum] = "b86c83cc1dcf4a6f84e2fbe32f9c39591a36e6e418af00533505f3452496adef"
RDEPENDS_${PN} += "io-socket-ssl-perl"
RDEPENDS_${PN} += "libwww-perl-perl"
RDEPENDS_${PN} += "mozilla-ca-perl"
RDEPENDS_${PN} += "net-http-perl"

S = "${WORKDIR}/LWP-Protocol-https-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
