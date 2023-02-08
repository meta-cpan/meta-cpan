DESCRIPTION = "Primarily (but not exclusively) for use in test scripts: A block eval on \
steroids, configurable and extensible, but by default trapping (Perl) \
STDOUT, STDERR, warnings, exceptions, would-be exit codes, and return \
values from boxed blocks of test code."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Trap"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/EB/EBHANSSEN/Test-Trap-v0.3.4.tar.gz"

SRC_URI[md5sum] = "7cb432fcb7b8f761e9cc2fc12e76b80b"
SRC_URI[sha256sum] = "0b04656f33b6c96da8eec4cffe5286150b4e4b5e2991d3883686b10910105ae2"
RDEPENDS:${PN} += "data-dump-perl"

S = "${WORKDIR}/Test-Trap-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
