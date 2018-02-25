DESCRIPTION = "Ref::Util introduces several functions to help identify references in a \
smarter (and usually faster) way. In short:"

SECTION = "libs"
LICENSE = "MIT"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Ref-Util"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AR/ARC/Ref-Util-0.203.tar.gz"

SRC_URI[md5sum] = "df89f68d9de58f1dc597047284f31fad"
SRC_URI[sha256sum] = "6425ffd7ec0c1799086daf5b4e848211ca5d058bd75b7629dbab7b739dfb6dfb"
RRECOMMENDS_${PN} += "ref-util-xs-perl"

S = "${WORKDIR}/Ref-Util-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
