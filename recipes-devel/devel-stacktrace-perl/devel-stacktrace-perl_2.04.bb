DESCRIPTION = "The "Devel::StackTrace" module contains two classes, "Devel::StackTrace" \
and Devel::StackTrace::Frame. These objects encapsulate the information \
that can retrieved via Perl's "caller" function, as well as providing a \
simple interface to this data."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-StackTrace"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Devel-StackTrace-2.04.tar.gz"

SRC_URI[md5sum] = "a5b09f7be7f2b10b525a9740676906d8"
SRC_URI[sha256sum] = "cd3c03ed547d3d42c61fa5814c98296139392e7971c092e09a431f2c9f5d6855"

S = "${WORKDIR}/Devel-StackTrace-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
