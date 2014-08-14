DESCRIPTION = "In many applications it's wise to let Perl use Unicode for the strings \
it processes. Most of the interfaces Perl has to the outside world are \
still \
byte based. Programs therefore need to decode byte strings that enter \
the \
program from the outside and encode them again on the way out."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Encode-Locale"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/Encode-Locale-1.03.tar.gz"

SRC_URI[md5sum] = "de8422d068634e7c1068dab4e18b452f"
SRC_URI[sha256sum] = "f76337e0933225914111fcc3319ff4db359b1abfd1aa56dff2df5378db0e2d55"

S = "${WORKDIR}/Encode-Locale-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
