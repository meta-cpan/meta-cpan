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

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EB/EBHANSSEN/Test-Trap-v0.2.5.tar.gz"

SRC_URI[md5sum] = "040815f3121e2bea887461c623a806a4"
SRC_URI[sha256sum] = "f899287a063d306226b78fd55eaf7ae570d3a1e5dcee51539ff1b2299bbf4257"
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
