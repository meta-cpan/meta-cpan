DESCRIPTION = "This perhaps ridiculous-seeming module was created to test routines that \
manipulate random numbers by providing a known output from "rand". Given a \
list of seeds with "srand", it will return each in turn. After seeded \
random numbers are exhausted, it will always return 0. Seed numbers must be \
of a form that meets the expected output from "rand" as called with no \
arguments -- i.e. they must be between 0 (inclusive) and 1 (exclusive). In \
order to facilitate generating and testing a nearly-one number, this module \
exports the function "oneish", which returns a number just fractionally \
less than one."

SECTION = "libs"
LICENSE = "Apache-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-MockRandom"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Test-MockRandom-1.01.tar.gz"

SRC_URI[md5sum] = "5ea7e2ec70776129993721f7632d04da"
SRC_URI[sha256sum] = "2614930d84fc5deac39afbc1ee86ccd39b221507f27d4ee493ca26e5c921cce0"

S = "${WORKDIR}/Test-MockRandom-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
