DESCRIPTION = "If you have written a test module based on Test::Builder then \
Test::Tester allows you to test it with the minimum of effort."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Simple"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EX/EXODIST/Test-Simple-1.001014.tar.gz"

SRC_URI[md5sum] = "db7f57fd595e3e1c93c972307a88fa6e"
SRC_URI[sha256sum] = "55a414ce89eb7a5e9e84186f286b002054f10ae8ef4f8f2d61bb710e7549f16b"

S = "${WORKDIR}/Test-Simple-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
