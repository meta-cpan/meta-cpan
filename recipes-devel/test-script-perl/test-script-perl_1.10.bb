DESCRIPTION = "The intent of this module is to provide a series of basic tests for 80% \
of the testing you will need to do for scripts in the script (or bin as \
is also \
commonly used) paths of your Perl distribution."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Script"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/Test-Script-1.10.tar.gz"

SRC_URI[md5sum] = "011e805ea9967aab5d685b33e7d2e9be"
SRC_URI[sha256sum] = "d61db6a6b98aba023da5f8c7aac6bb30ce43ca76a7a03d73b1e3d85a8b8aab73"
RDEPENDS_${PN} += "ipc-run3-perl"
RDEPENDS_${PN} += "probe-perl-perl"
DEPENDS += "test-simple-perl-native"

S = "${WORKDIR}/Test-Script-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
