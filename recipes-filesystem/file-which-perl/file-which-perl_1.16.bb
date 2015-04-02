DESCRIPTION = ""File::Which\" was created to be able to get the paths to executable \
programs on systems under which the `which' program wasn't implemented \
in the shell."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-Which"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/File-Which-1.16.tar.gz"

SRC_URI[md5sum] = "8192038f4ee80719a554fa28ad6557e3"
SRC_URI[sha256sum] = "f53ddcc3a2b04bcf51759352536087206f45efddcd50841ab820893bb831323c"

S = "${WORKDIR}/File-Which-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
