DESCRIPTION = "Log::Log4perl lets you remote-control and fine-tune the logging \
behaviour of your system from the outside. It implements the widely popular \
(Java-based) Log4j logging package in pure Perl."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Log4perl"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MS/MSCHILLI/Log-Log4perl-1.46.tar.gz"

SRC_URI[md5sum] = "d247d2327d7f32dca09cbeb51a953fc5"
SRC_URI[sha256sum] = "31011a17c04e78016e73eaa4865d0481d2ffc3dc22813c61065d90ad73c64e6f"

S = "${WORKDIR}/Log-Log4perl-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
