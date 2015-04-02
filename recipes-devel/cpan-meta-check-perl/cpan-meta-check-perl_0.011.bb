DESCRIPTION = "This module verifies if requirements described in a CPAN::Meta object \
are present."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/CPAN-Meta-Check"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/CPAN-Meta-Check-0.011.tar.gz"

SRC_URI[md5sum] = "2591aa5dd0658a6502a7bf068754e7bd"
SRC_URI[sha256sum] = "70127009da00525b3bd254ca334b857b45f1ef431fd111f383bc8d066107b15b"
RDEPENDS_${PN} += "perl"
DEPENDS += "test-deep-perl-native"

S = "${WORKDIR}/CPAN-Meta-Check-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
