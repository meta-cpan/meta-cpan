DESCRIPTION = "Net::DNS is a collection of Perl modules that act as a Domain Name System \
(DNS) resolver. It allows the programmer to perform DNS queries that are \
beyond the capabilities of "gethostbyname" and "gethostbyaddr"."

SECTION = "libs"
LICENSE = "MIT"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-DNS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://cpan.metacpan.org/authors/id/N/NL/NLNETLABS/Net-DNS-1.15.tar.gz"

SRC_URI[md5sum] = "daaf39133bb89a31c093510169c228e1"
SRC_URI[sha256sum] = "1ad46ba6438b846a94b4f50d53ecfda55f504a17e11b94effb087ff9329e61d0"
RDEPENDS_${PN} += "digest-hmac-perl"

S = "${WORKDIR}/Net-DNS-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
