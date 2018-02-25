DESCRIPTION = "Ref::Util::XS is the XS implementation of Ref::Util, which provides several \
functions to help identify references in a more convenient way than the \
usual approach of examining the return value of "ref"."

SECTION = "libs"
LICENSE = "MIT"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Ref-Util-XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://cpan.metacpan.org/authors/id/X/XS/XSAWYERX/Ref-Util-XS-0.117.tar.gz"

SRC_URI[md5sum] = "f9ae3f0495849ad49b5c7919d84444e4"
SRC_URI[sha256sum] = "fb64c5a823787f6600257918febd9fbc6f0305936fc3287b81a30c099b65633c"

S = "${WORKDIR}/Ref-Util-XS-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
