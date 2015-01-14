DESCRIPTION = "This module provides a few convenience methods for testing exception \
based code. It is built with Test::Builder and plays happily with \
Test::More and \
friends."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Exception"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EX/EXODIST/Test-Exception-0.36.tar.gz"

SRC_URI[md5sum] = "778c498989fdfb8b5cf5b37bd41fb7ab"
SRC_URI[sha256sum] = "b30bf587fdb6904e9dcfd6b21296ea7f2975c2c4019148b3e421e075758dfcfe"
RDEPENDS_${PN} += "sub-uplevel-perl"
DEPENDS += "perl"

S = "${WORKDIR}/Test-Exception-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
