DESCRIPTION = "Primarily (but not exclusively) for use in test scripts: A block eval \
on steroids, configurable and extensible, but by default trapping (Perl) \
STDOUT, STDERR, warnings, exceptions, would-be exit codes, and return \
values from boxed blocks of test code."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Trap"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EB/EBHANSSEN/Test-Trap-v0.3.2.tar.gz"

SRC_URI[md5sum] = "5ba3fd70ad9776adf972f734872b4760"
SRC_URI[sha256sum] = "399b9309c669d161dcd9ee2e1377aa4027e7428ff4f5ffd07cc16852e725054b"
RDEPENDS_${PN} += "data-dump-perl"
RDEPENDS_${PN} += "test-simple-perl"

S = "${WORKDIR}/Test-Trap-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
