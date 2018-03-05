DESCRIPTION = "Primarily (but not exclusively) for use in test scripts: A block eval on \
steroids, configurable and extensible, but by default trapping (Perl) \
STDOUT, STDERR, warnings, exceptions, would-be exit codes, and return \
values from boxed blocks of test code."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Trap"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EB/EBHANSSEN/Test-Trap-v0.3.3.tar.gz"

SRC_URI[md5sum] = "e4731d0a67a0944bcb6d3df9d7e184da"
SRC_URI[sha256sum] = "ac54b82027815892faabce21e094b852dd208b1f056cecfd78f183e9257ee698"
RDEPENDS_${PN} += "data-dump-perl"

S = "${WORKDIR}/Test-Trap-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
