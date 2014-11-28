DESCRIPTION = "Compute `intelligent' differences between two files / lists but use the \
old (<=0.59) interface."

SECTION = "libs"
LICENSE = "unknown(unknown)"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Algorithm-Diff"

LIC_FILES_CHKSUM = "unknown(unknown)"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TY/TYEMQ/Algorithm-Diff-1.1903.tar.gz"

SRC_URI[md5sum] = "0e8add21a641b8d66436df0c2024bf3b"
SRC_URI[sha256sum] = "30e84ac4b31d40b66293f7b1221331c5a50561a39d580d85004d9c1fff991751"
DEPENDS += "extutils-makemaker-perl-native"

S = "${WORKDIR}/Algorithm-Diff-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
