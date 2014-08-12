DESCRIPTION = "Method modifiers are a convenient feature from the CLOS (Common Lisp \
Object System) world."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Class-Method-Modifiers"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/E/ET/ETHER/Class-Method-Modifiers-2.10.tar.gz"

SRC_URI[md5sum] = "bd56ab860d1a24e6d9c7e87e36e2b09c"
SRC_URI[sha256sum] = "420fb53f789f53ecddc17890b0f648289397cceeb2de05f0994999fdf329e7b6"
DEPENDS += "test-fatal-perl-native"
RECOMMENDS += "perl"

S = "${WORKDIR}/Class-Method-Modifiers-${PV}"



inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
