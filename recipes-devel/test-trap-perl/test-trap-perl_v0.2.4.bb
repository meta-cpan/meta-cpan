DESCRIPTION = "Primarily (but not exclusively) for use in test scripts: A block eval \
on steroids, configurable and extensible, but by default trapping \
(Perl) \
STDOUT, STDERR, warnings, exceptions, would-be exit codes, and return \
values \
from boxed blocks of test code."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Trap"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/E/EB/EBHANSSEN/Test-Trap-v0.2.4.tar.gz"

SRC_URI[md5sum] = "c7c361af839703ff38046e740071261b"
SRC_URI[sha256sum] = "9ec18229bbe918f424786fe4bde57f374359dd988d25433bb325b3d994f67ce0"
RDEPENDS_${PN} += "data-dump-perl"
RDEPENDS_${PN} += "test-tester-perl"
DEPENDS += "perl"

S = "${WORKDIR}/Test-Trap-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
