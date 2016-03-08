DESCRIPTION = "This module makes the functionality of the perltidy utility available to \
perl scripts. Any or all of the input parameters may be omitted, in which \
case the @ARGV array will be used to provide input parameters as described \
in the perltidy(1) man page."

SECTION = "libs"
LICENSE = "GPLv2+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Perl-Tidy"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHANCOCK/Perl-Tidy-20160302.tar.gz"

SRC_URI[md5sum] = "997c888b2e413982a598233dc29778a7"
SRC_URI[sha256sum] = "6dd04ed8c315bcfea8fe713de8f9de68955795b6864f3be6c177e802fd30dca7"

S = "${WORKDIR}/Perl-Tidy-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
