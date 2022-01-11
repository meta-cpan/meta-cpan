DESCRIPTION = "IO::HTML provides an easy way to open a file containing HTML while \
automatically determining its encoding. It uses the HTML5 encoding \
sniffing \
algorithm specified in section 8.2.2.2 of the draft standard."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-HTML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/C/CJ/CJM/IO-HTML-1.001.tar.gz"

SRC_URI[md5sum] = "3f8958718844dc96b9f6946f21d70d22"
SRC_URI[sha256sum] = "ea78d2d743794adc028bc9589538eb867174b4e165d7d8b5f63486e6b828e7e0"

S = "${WORKDIR}/IO-HTML-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
