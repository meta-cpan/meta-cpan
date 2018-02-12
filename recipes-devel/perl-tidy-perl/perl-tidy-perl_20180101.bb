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

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHANCOCK/Perl-Tidy-20180101.tar.gz"

SRC_URI[md5sum] = "a5bffe2552688755a59eddc1fe9009b8"
SRC_URI[sha256sum] = "cc6f8f6e193eef3be3b5327ad3128b029ce254238c8647afed78a477482a303c"

S = "${WORKDIR}/Perl-Tidy-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
