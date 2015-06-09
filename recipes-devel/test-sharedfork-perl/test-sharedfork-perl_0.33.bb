DESCRIPTION = "Test::SharedFork is utility module for Test::Builder."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-SharedFork"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EX/EXODIST/Test-SharedFork-0.33.tar.gz"

SRC_URI[md5sum] = "5e9445ea773211f743ac0f64e276f70d"
SRC_URI[sha256sum] = "16238d4343083e1466d52e4d8876b8bd2d6fbb26136ba5e0e9d62babebac5c8a"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Test-SharedFork-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
