DESCRIPTION = "This module implements the Rijndael cipher, which has just been \
selected as the Advanced Encryption Standard."

SECTION = "libs"
LICENSE = "unknown(open_source)"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Crypt-Rijndael"

LIC_FILES_CHKSUM = "unknown(open_source)"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/Crypt-Rijndael-1.13.tar.gz"

SRC_URI[md5sum] = "2af117c9ab4052cec05cf6737c5f3f45"
SRC_URI[sha256sum] = "cd7209a6dfe0a3dc8caffe1aa2233b0e6effec7572d76a7a93feefffe636214e"

S = "${WORKDIR}/Crypt-Rijndael-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
