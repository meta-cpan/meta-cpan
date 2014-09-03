DESCRIPTION = "Method modifiers are a convenient feature from the CLOS (Common Lisp \
Object System) world."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Class-Method-Modifiers"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/E/ET/ETHER/Class-Method-Modifiers-2.11.tar.gz"

SRC_URI[md5sum] = "c6982e9e89325713d5afaff82cfe1744"
SRC_URI[sha256sum] = "debf979fbd9ac25cc6fe7d1cab81103c60a21f7027d2a9b4bf5cb264e313d392"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"
RECOMMENDS += "perl"

S = "${WORKDIR}/Class-Method-Modifiers-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
