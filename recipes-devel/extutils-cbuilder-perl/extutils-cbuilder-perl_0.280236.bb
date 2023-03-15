DESCRIPTION = "This module can build the C portions of Perl modules by invoking the \
appropriate compilers and linkers in a cross-platform manner. It was \
motivated by the "Module::Build" project, but may be useful for other \
purposes as well. However, it is *not* intended as a general cross-platform \
interface to all your C building needs. That would have been a much more \
ambitious goal!"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-CBuilder"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AM/AMBS/ExtUtils-CBuilder-0.280236.tar.gz"

SRC_URI[md5sum] = "a4c9654c7344bbec02ced59a6b6027bb"
SRC_URI[sha256sum] = "abc21827eb8a513171bf7fdecefce9945132cb76db945036518291f607b1491f"

S = "${WORKDIR}/ExtUtils-CBuilder-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
