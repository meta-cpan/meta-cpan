DESCRIPTION = "Ref::Util introduces several functions to help identify references in a \
smarter (and usually faster) way. In short:"

SECTION = "libs"
LICENSE = "MIT"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Ref-Util"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AR/ARC/Ref-Util-0.204.tar.gz"

SRC_URI[md5sum] = "add072ed1e481dc43ad6bb8bbe36ab99"
SRC_URI[sha256sum] = "415fa73dbacf44f3d5d79c14888cc994562720ab468e6f71f91cd1f769f105e1"

S = "${WORKDIR}/Ref-Util-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
